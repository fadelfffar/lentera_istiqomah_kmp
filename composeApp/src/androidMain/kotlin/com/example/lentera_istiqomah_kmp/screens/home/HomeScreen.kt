package com.example.lentera_istiqomah_kmp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.lentera_istiqomah_kmp.data.PrayersObject
import cafe.adriel.voyager.koin.koinScreenModel
import com.example.lentera_istiqomah_kmp.R
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


data class TopLevelRoute<T : Any>(val name: String, val route: T, val icon: ImageVector)

//val topLevelRoutes = listOf(
//    TopLevelRoute("Profile", Profile, Icons.Profile),
//    TopLevelRoute("Friends", Friends, Icons.Friends)
//)


class HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val cardModifier  = Modifier
            .padding(horizontal = 20.dp, vertical = 4.dp)
            .size(width = 400.dp, height = 60.dp)
        Scaffold(
            topBar = {
                TopAppBar (
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0x00000000),
                    contentColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0x00000000),
                   title =  {
                       Text("Lentera Istiqomah",
                           modifier = Modifier.padding(vertical = 26.dp),
                           style = TextStyle(
                               fontWeight = FontWeight.W600,
                               fontSize = 18.sp,
                               color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffFFFFFF)
                           ))
                   },
                    navigationIcon = {
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.logo_lentera_foreground  ),
                            contentDescription =  "",
                        )
                    }
                )
            },
            modifier = Modifier
                .size(width = 440.dp, height = 780.dp),
            color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff359D59),
        ) {

            Column (
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Row {
                    Image(
                        modifier = Modifier
                            .width(72.dp)
                            .height(72.dp),
                        painter = androidx.compose.ui.res.painterResource(id = R.mipmap.logo_lentera_foreground  ),
                        contentDescription =  "",
                    )
                    Divider(Modifier.width(4.dp))
                    Text("Lentera Istiqomah",
                        modifier = Modifier.padding(vertical = 26.dp),
                        style = TextStyle(
                            fontWeight = FontWeight.W600,
                            fontSize = 18.sp,
                            color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffFFFFFF)
                        ))
                }
                Text(
                    "Selamat Datang di Mobile Lentera Istiqomah",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                )
                Text(
                    "Media Dakwah Masjid Al Istiqomah Purbalingga Pancarkan Cahaya Ilmu Tenangkan Jiwa",
                    style = TextStyle(
                        color = _root_ide_package_.androidx.compose.ui.graphics.Color(0XFFFFFFFF),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                )
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Imsak",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "04:22",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Subuh",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "04:32",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Terbit",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "05:44",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Dhuha",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "06:12",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Dzuhur",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "11:57",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Ashar",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "15:01",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Maghrib",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "18:03",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
                Card(
                    modifier = cardModifier,
                    backgroundColor = _root_ide_package_.androidx.compose.ui.graphics.Color(0xffF9FCF2),
                    elevation = 3.dp,
                    shape = MaterialTheme.shapes.small
                ){
                    Row {
                        Divider(Modifier.width(12.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.mipmap.icon_imsyak_foreground  ),
                            contentDescription =  "",
                            Modifier.size(height = 60.dp, width = 30.dp)
                        )
                        Divider(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Isya",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff778288),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.W400
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                            Text(
                                text = "19:12",
                                style = TextStyle(
                                    color = _root_ide_package_.androidx.compose.ui.graphics.Color(0xff474E52),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier
                                    .padding(4.dp),
                                textAlign = TextAlign.Left,
                            )
                        }
                    }
                }
            }
        }
//        val screenModel = rememberScreenModel { HomeViewModel()}

//        val objects by screenModel.objects.collectAsStateWithLifecycle()
//
//        ObjectPrayer(obj = objects)
    }
}

@Composable
private fun ObjectPrayer(
//    obj: PrayersObject,
    modifier: Modifier = Modifier,
    ) {
    Column(
        modifier
            .padding(8.dp))
    {
    }
}